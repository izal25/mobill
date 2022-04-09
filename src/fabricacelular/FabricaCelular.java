/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacelular;

import java.util.ArrayList;

/**
 *
 * @author francisleide
 */
public class FabricaCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciando bateria
        Bateria bateria1 = new Bateria();
        bateria1.setModelo("ASDSGFGBF");
        bateria1.setCapacidade(12);
        bateria1.setMarca("Boa");
        bateria1.setVoltagem(200);
       // System.out.println("Modelo da bateria: "+bateria1.getModelo());
        //instanciando celular
        Celular celular1 = new Celular();
        celular1.setModelo("Iphone 11");
        celular1.setMarca("Apple");
        celular1.setPxCamera(12121);
        celular1.setTamanho(11);
        celular1.setBateria(bateria1);
        System.out.println("Modelo: "+celular1.getModelo());
        System.out.println("Modelo da Bateria: "+celular1.getBateria());
        
        
        //instanciando mais uma bateria
        Bateria bateria2 = new Bateria();
        bateria2.setCapacidade(24);
        bateria2.setMarca("Excelente");
        bateria2.setModelo("werzxd234");
        bateria2.setVoltagem(110);
        
        //instanciando mais uma bateria
        Bateria bateria3 = new Bateria();
        bateria3.setCapacidade(18);
        bateria3.setMarca("Boazinha");
        bateria3.setModelo("SDFREWE");
        bateria3.setVoltagem(110);
        
        //criar lista de baterias
        ArrayList<Bateria> baterias = new ArrayList<>();
        baterias.add(bateria1);
        baterias.add(bateria2);
        baterias.add(bateria3);
        
        for (int i = 0; i < baterias.size(); i++) {
            System.out.println("Modelo: "+baterias.get(i).getModelo());
            System.out.println("Capacidade: "+baterias.get(i).getCapacidade());
        }
        
        //TODO: 
        // instanciar vários programas 
        // instanciar uma lista de programas
        // adicionar os programas instanciados na lista
        // atribuit a lista para o celular
        // EXTRA: Calcular no getProgramas o total de espaço ocupado 
        
        
        
    }
    
}
