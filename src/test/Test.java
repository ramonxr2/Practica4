package test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {

  public static void main(String args[]) {
  Test juego=new Test();

  juego.jugar();
  }

  public void jugar(){
      Scanner teclado=new Scanner(System.in);
      System.out.println("ingrese el numero de jugadores: (2-100)");
      int players=teclado.nextInt();
      int repetidas=0;
      //conseguir numero de barajas
      int numBarajas=1+(players/3);
      Jugador jugadores[]=new Jugador[players];

      for(int i=0;i<players;i++){
      jugadores[i]=new Jugador();
      }
      
      ArrayList<Carta>[] cartasPlayer= new ArrayList[players];
      ArrayList<Carta> baraja;
      ArrayList<Carta> cartasElegidas= new ArrayList<Carta>();
      ArrayList<Integer> valores=new ArrayList<Integer>();
      ArrayList<Integer> puntos=new ArrayList<Integer>();
      int valorMax, indexValMax=0;
      for(int i=0;i<players;i++){
      cartasPlayer[i]=new ArrayList<>();
      }
      int barajaSize=52*numBarajas;
      Baraja barajas=new Baraja();
      barajas.setBarajaSize(barajaSize);
      barajas.setNumBarajas(numBarajas);
      //se inicializa la baraja, se llena con las cartas
      
      baraja=barajas.inicializa();

      System.out.println("Numero de barajas: "+numBarajas);
      System.out.println("Cartas en baraja: "+barajaSize);
      //luego repartimos las 5 cartas a cada jugador
      
      for(int i=0;i<players;i++){
      cartasPlayer[i]=barajas.repartir(5,baraja,barajaSize);
      barajaSize=barajaSize-5;
      System.out.println("Cartas en baraja: "+barajaSize);
      }
      
      baraja=barajas.getBaraja();

      
      //mostrar las cartas de cada jugador
      for(int i=0;i<players;i++){
          System.out.println("Cartas del jugador "+(i+1)+":");
          for(int j=0;j<5;j++){
              System.out.println(cartasPlayer[i].get(j).toString());
          }
      }
      //tamano de baraja despues de repartir
      System.out.println("Cartas en baraja: "+baraja.size());
  
       //inicia el juego
       int i=0,x=0,index;
       boolean esMayor=false;
       
       
  do{
      
      
      System.out.println("Turno del jugador "+(i+1)+":");
      System.out.println("Cartas del jugador "+(i+1)+":");
      
          for(int j=0;j<cartasPlayer[i].size();j++){
              System.out.println(cartasPlayer[i].get(j).toString());
          }
          
     if(!cartasPlayer[i].isEmpty()){
         //lectura de cartas
         do{
      System.out.println("Elija del 1 al "+cartasPlayer[i].size()+": Cual carta lanzar:");
      index=teclado.nextInt();
      if(index>cartasPlayer[i].size()){
      esMayor=true;
      } else {
      esMayor=false;
      cartasElegidas.add(cartasPlayer[i].get(index-1));
      cartasPlayer[i].remove(index-1);
      }
         }while(esMayor==true);
      
    if(i<players-1){
    i++;
    }else{
    i=0;
    }
    x++;
    
    if(cartasElegidas.size()==players){
        
          for (int j=0;j<cartasElegidas.size();j++) {
          valores.add(cartasElegidas.get(j).getValor());
          }
          valorMax=Collections.max(valores);
          
          for (int j=0;j<cartasElegidas.size();j++) {
            if(valorMax==cartasElegidas.get(j).getValor()){
            indexValMax=j;
            }
          }
          
        boolean valoresIguales=false;
        for(int j=0;j<cartasElegidas.size();j++){
         for(int y=j+1;y<cartasElegidas.size();y++){
         if (valores.get(j).equals(valores.get(y))){
          valoresIguales=true;
          break;
          }
         }
        }
        
        if(valoresIguales==true){
            System.out.println("Uno de los valores elegidos es repetido");
            if (repetidas==1){
                System.out.println("Todos los jugadores tendran 1 punto.");
                
                for(int j=0;j<players;j++){
                jugadores[i].setPuntos(1);
                }
                
            }
            
            repetidas=repetidas+1;
            
        }else{
          
          
        System.out.println("Gana el jugador: "+(indexValMax+1));
        jugadores[indexValMax].setPuntos(2);
        
        //
        System.out.println("Puntos para cada jugador: ");
      for(int j=0;j<players;j++){
          System.out.println("Jugador "+(j+1)+": "+jugadores[j].getPuntosAcum());
      }
        
        }
        
        cartasElegidas.clear();
    }
     } else {
     
         System.out.println("Jugador "+(i+1)+" se ha quedado sin cartas. ");
         Random dado=new Random();
         int dadovalor=dado.nextInt(6)+1;
         
         System.out.println("Al lanzar el dado se determina que agarrara "+dadovalor+" cartas.");
         
     cartasPlayer[i]=barajas.repartir(dadovalor, baraja, barajaSize);
     
     }
     
     
    }while(x<(10*players));
  
for (int j=0;j<players;j++) {
          puntos.add(jugadores[j].getPuntos());
          }
        int puntosMax=Collections.max(puntos);
        int indexPuntosMax=0;
        
        for (int j=0;j<players;j++) {
            if(puntosMax==jugadores[j].getPuntos()){
            indexPuntosMax=j;
            }
        }
        
      System.out.println("Puntos finales para cada jugador: ");
      for(int j=0;j<players;j++){
          System.out.println("Jugador "+(j+1)+": "+jugadores[j].getPuntosAcum());
      }
      System.out.println("Gana el jugador: "+(indexPuntosMax+1));
  
}
  
}
