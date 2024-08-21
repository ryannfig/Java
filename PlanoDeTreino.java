package planodetreino;

import javax.swing.JOptionPane;

public class PlanoDeTreino {

    public static void main(String[] args) {
   
    int dia = 0;
    
    do{
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Digite um número de 0 a 7: <br><em>(0 Interrompe.)"));
 
        if(dia == 1){
            JOptionPane.showMessageDialog(null, "Domingo: descanso.");
        }
        else if(dia == 2){
            JOptionPane.showMessageDialog(null,"<html>Segunda: Quadríceps.<br>"
                    + "<html>->Extensora(Unilateral):<br>"
                    + "<html>8 barras, 15 reps;<br>"
                    + "<html>9 barras, 12 reps;<br>"
                    + "<html>10 barras, 10 reps;<br>"
                    + "<html>11 barras, 8 reps;<br>"
                    + "<html>->Agachamento:<br>"
                    + "<html>40kg, 10 reps;<br>"
                    + "<html>50kg, 8 reps;<br>"
                    + "<html>60kg, 7 reps;<br>"
                    + "<html>->Leg 45:<br>"
                    + "<html>220kg, 10 reps;<br>"
                    + "<html>230kg, 8 reps;<br>"
                    + "<html>240kg, 6 reps;<br>"
                    + "<html>->Leg 90:<br>"
                    + "<html>50kg, 8 reps(2x);<br>"
                    + "<html>52kg, 8 reps;<br>");
                      
                    JOptionPane.showMessageDialog(null, "<html>Posterior de Coxa:<br>"
                    + "<html>->Flexora Unilateral:<br>"
                    + "<html>4 barras, 15 reps;<br>"
                    + "<html>5 barras, 12 reps;<br>"
                    + "<html>6 barras, 10 reps;<br>"
                    + "<html>7 barras, 8 reps;<br>"
                    + "<html>->Cadeira Flexora:<br>"
                    + "<html>40kgkg, 10 reps;<br>"
                    + "<html>50kg, 8 reps;<br>"
                    + "<html>55kgkg, 8 reps;<br>");
                    
                    JOptionPane.showMessageDialog(null,"<html>Panturrilha:<br>"
                    + "<html>->Unilateral(Halteres):<br>"
                    + "<html>8kg, 12 reps;<br>"
                    + "<html>10kg, 10 reps;<br>"
                    + "<html>12kg, 8 reps;<br>"
                    + "<html>->Leg 45:<br>"
                    + "<html>190kg, 12 reps;<br>"
                    + "<html>210kg, 10 reps;<br>"
                    + "<html>220kg, 10 reps;<br>"
                    + "<html>->Sentado:<br>"
                    + "<html>65kg, 12 reps;<br>"
                    + "<html>70kg, 10 reps;<br>"
                    + "<html>73kg, 9 reps;<br>"); 
                }
        else if(dia == 3){
            JOptionPane.showMessageDialog(null,"<html>Terça-feira: Costas e Tríceps.<br>"
                    + "<html>->Puxada (Padrão):<br>"
                    + "<html>9 barras, 15 reps;<br>"
                    + "<html>10 barras, 12 reps;<br>"
                    + "<html>11 barras, 10 reps;<br>"
                    + "<html>12 barras, 8 reps;<br>"
                    + "<html>->Puxada (Barra Triângulo):<br>"
                    + "<html>10 barras, 10 reps;<br>"
                    + "<html>11 barras, 8 reps;<br>"
                    + "<html>12 barras, 6 reps;<br>"
                    + "<html>->Remada Curvada(Barra W):<br>"
                    + "<html>50kg, 12 reps;<br>"
                    + "<html>56kg, 10 reps;<br>"
                    + "<html>60kg, 8 reps;<br>"
                    + "<html>->Remada na Polia(Unilateral):<br>"
                    + "<html>40kg, 10 reps;<br>"
                    + "<html>43kg, 8 reps;<br>"
                    + "<html>45kg, 7 reps;<br>"
                    + "<html>->Último Exercício:<br>"
                    + "<html>45kg, 10 reps;<br>"
                    + "<html>50kg, 8 reps;<br>"
                    + "<html>53kg, 8 reps;<br>"
                    + "<html>->Encolhimento c/ barra W(Trapézio):<br>"
                    + "<html>20kg, 13 reps;<br>"
                    + "<html>25kg, 11 reps;<br>"
                    + "<html>30kg, 10 reps;<br>");
                    
                    JOptionPane.showMessageDialog(null,"<html>Tríceps: <br>"
                    + "->Francês na Polia(Barra Triângulo):<br>"
                    + "<html>40kg, 15 reps;<br>"
                    + "<html>45kg, 12 reps;<br>"
                    + "<html>48kg, 10 reps;<br>"
                    + "<html>50kg, 8 reps;<br>"
                    + "<html>->Corda:<br>"
                    + "<html>35kg, 10 reps;<br>"
                    + "<html>40kg, 8 reps;<br>"
                    + "<html>41kg, 8 reps;<br>"
                    + "<html>->Coice na Polia(Unilateral):<br>"
                    + "<html>10kg, 12 reps;<br>"
                    + "<html>11kg, 10 reps;<br>"
                    + "<html>12kg, 8 reps;<br>"
                    + "<html>13kg, 6 reps;<br>"
                    + "<html>->Testa c/ Barra W:<br>"
                    + "<html>6kg, 10 reps;<br>"
                    + "<html>7kg, 8 reps;<br>"
                    + "<html>9kg, 6 reps;<br>");
        }        
        else if(dia == 4){
            JOptionPane.showMessageDialog(null,"Quarta-feira: descanso.");
        }
        else if(dia == 5){
            JOptionPane.showMessageDialog(null,"<html>Quinta-feira: Peito e Bíceps.<br>"
                    + "<html>->Crussifixo(Polia):<br>"
                    + "<html>20kg, 15 reps;<br>"
                    + "<htnl>25kg, 12 reps;<br>"
                    + "<html>30kg, 10 reps;<br>"
                    + "<html>33kg, 8 reps;<br>"
                    + "<html>->Supino Inclinado(Halteres):<br>"
                    + "<html>22kg, 10 reps;<br>"
                    + "<html>24kg, 8 reps;<br>"
                    + "<html>26kg, 6 reps;<br>"
                    + "<html>->Cross Over:<br>"
                    + "<html>20kg, 12 reps;<br>"
                    + "<html>25kg, 10 reps;<br>"
                    + "<html>30kg, 8 reps;<br>"
                    + "<html>->Cross em Baixo<br>"
                    + "<html>10kg, 10 reps;<br>"
                    + "<html>15kg, 8 reps;<br>"
                    + "<html>20kg, 7 reps;<br>"
                    + "<html>->Supino(Máquina)<br>"
                    + "<html>11 barras, 10 reps;<br>"
                    + "<html>12 barras, 8 reps;<br>"
                    + "<html>13 barras, 6 reps;<br>");
            
            JOptionPane.showMessageDialog(null,"<html>Bíceps:<br>"
                    + "<html>->Martelo c/ Halteres:<br>"
                    + "<html>10kg, 15 reps;<br>"
                    + "<html>12kg, 12 reps;<br>"
                    + "<html>14kg, 10 reps<br>"
                    + "<html>16kg, 8 reps;<br>"
                    + "<html>->Banco Inclinado(Polia):<br>"
                    + "<html>20kg, 10 reps;<br>"
                    + "<html>25kg, 8 reps;<br>"
                    + "<html>30kg, 4 reps;<br>"
                    + "<html>->Scott no banco(Barra W):<br>"
                    + "<html>15kg, 12 reps;<br>"
                    + "<html>18kg, 10 reps;<br>"
                    + "<html>20kg, 8 reps;<br>"
                    + "<html>->Rosca Inversa:<br>"
                    + "<html>35kg, 12 reps;<br>"
                    + "<html>40kg, 10 reps;<br>"
                    + "<html>42kg, 8 reps;<br>");   
        }
        else if(dia == 6){
            JOptionPane.showMessageDialog(null,"<html>Sexta-feira: Posterior de Coxa.<br>"
                    + "<html>->Flexora Unilateral:<br>"
                    + "<html>3 barras, 15 reps;<br>"
                    + "<html>4 barras, 12 reps;<br>"
                    + "<html>5 barras, 10 reps;<br>"
                    + "<html>6 barras, 10 reps;<br>"
                    + "<html>->Front Squat:<br>"
                    + "<html>20kg, 10 reps;<br>"
                    + "<html>30kg, 8 reps;<br>"
                    + "<html>36kg, 8 reps;<br>"
                    + "<html>->Stiff c/ Halteres:<br>"
                    + "<html>32kg, 10 reps;<br>"
                    + "<html>34kg, 8 reps;<br>"
                    + "<html>36kg, 6 reps;<br>"
                    + "<html>->Mesa Flexora:<br>"
                    + "<html>40kg, 12 reps;<br>"
                    + "<html>50kg, 10 reps;<br>"
                    + "<html>60kg, 7 reps;<br>");
            
            JOptionPane.showMessageDialog(null,"<html>Quadríceps:<br>"
                    + "<html>->Cadeira Extensora:<br>"
                    + "<html>30kg, 15 reps;<br>"
                    + "<html>40kg, 15 reps;<br>"
                    + "<html>60kg, 12 reps;<br>"
                    + "<html>80kg, 12 reps;<br>"
                    + "<html>->Hack:<br>"
                    + "<html>25kg, 10 reps;<br>"
                    + "<html>30kg, 8 reps;<br>"
                    + "<html>33kg, 7 reps;<br>"
                    + "<html>->Abdutora(Abrindo):<br>"
                    + "<html>6 barras, 15 reps;<br>"
                    + "<html>7 barras, 12 reps;<br>"
                    + "<html>8 barras, 10 reps;<br>"
                    + "<html>9 barras, 10 reps;<br>");
            
            JOptionPane.showMessageDialog(null,"<html>Panturrilha:<br>"
                    + "<html>->Leg 45:<br>"
                    + "<html>150kg, Carga fixa;<br>"
                    + "<html>->Sentado:<br>"
                    + "<html>60kg, Carga fixa;<br>");
        }
        else if(dia == 7){
            JOptionPane.showMessageDialog(null, "<html>Sábado: Ombro.<br>"
                    + "<html>->Desenvolvimento:<br>"
                    + "<html>14kg, 15 reps;<br>"
                    + "<html>16kg, 12 reps;<br>"
                    + "<html>18kg, 10 reps;<br>"
                    + "<html>20kg, 7 reps;<br>"
                    + "<html>->Elevação Lateral(Halteres):<br>"
                    + "<html>8kg, 12 reps;<br>"
                    + "<html>10kg, 10 reps;<br>"
                    + "<html>12kg, 8 reps;<br>"
                    + "<html>14kg, 8 reps;<br>"
                    + "<html>->Unilateral na polia:<br>"
                    + "<html>5kg, 12 reps;<br>"
                    + "<html>6kg, 10 reps;<br>"
                    + "<html>7kg, 8 reps;<br>"
                    + "<html>->Elevação Frotal na Polia(Barra Triângulo):<br>"
                    + "<html>30kg, 10 reps;<br>"
                    + "<html>33kg, 8 reps;<br>"
                    + "<html>35kg, 7 reps;<br>"
                    + "<html>->Elevaçâo Lateral na Polia(Unilateral):<br>"
                    + "<html>8kg, 10 reps;<br>"
                    + "<html>11kg, 8 reps;<br>"
                    + "<html>12kg, 6 reps;<br>"
                    + "<html>->"
                    + "Crussifixo Inverso:<br>"
                    + "<html>4 barras, 12 reps;<br>"
                    + "<html>5 barras, 10 reps;<br>"
                    + "<html>6 barras, 8 reps;<br>");
        }
        else if(dia == 0){
            JOptionPane.showMessageDialog(null,"Código finalizado.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Inválido. Digite apenas o que se pede.");
        }    
    }while(dia != 0); 
    }  

}
