package tools;

import javax.swing.JOptionPane;
public class IOP {
    

   public static void outText(String texto){
       JOptionPane.showMessageDialog(null,texto);
    }
   public static String inText(String texto){
       return JOptionPane.showInputDialog(null,texto);
    }
   public static int inInt(String texto){
       int dato=0;
       boolean correcto=false;
       while (!correcto){
           try{
               dato=Integer.parseInt(JOptionPane.showInputDialog(null,texto));
               correcto=true;
            }catch(Exception ex){
                outText("Dato no válido");
            }
        }
       return dato;
    }
       public static int inInt(String texto, int inicio, int fin){
       int dato=0;
       boolean correcto=false;
       while (!correcto){
           try{
               dato=Integer.parseInt(JOptionPane.showInputDialog(null,texto));
               if (dato>=inicio && dato<=fin){
                    correcto=true;
                }else{
                    outText("El dato debe estar en el rango de "+inicio+" y "+fin);
                }
                      }catch(Exception ex){
                outText("Dato no válido");
            }
        }
       return dato;
    }
    public static float inFloat(String texto){
        float dato=0.0f;
        boolean correcto=false;
        while(!correcto){
         try{
            dato=Byte.parseByte(JOptionPane.showInputDialog(null,texto));
            correcto=true;
            }catch(Exception ex){
            outText("Dato no válido");
            }
        }
        return dato;
    }
     public static float inFloat(String texto, int inicio, int fin){
        float dato=0.0f;
        boolean correcto=false;
        while(!correcto){
         try{
            dato=Byte.parseByte(JOptionPane.showInputDialog(null,texto));
            if (dato>=inicio && dato<=fin){
                    correcto=true;
                }else{
                    outText("El dato debe estar en el rango de "+inicio+" y "+fin);
                }
            }catch(Exception ex){
            outText("Dato no válido");
            }
        }
        return dato;
    }

}
