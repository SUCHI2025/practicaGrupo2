
/**
 * Write a description of class Generar here.
 * 
 * @author (Daniel Gutierrez) 
 * @version (20.04.2024)
 */
public class Generar
{
    boolean puedoGenerar(String[] c, String x){
        return coincide(c,x,0,0);
    }
    
    private boolean coincide(String[] c, String x, int i, int j){
        if(i>=c.length){
            return false;
        }else{
            if(x.indexOf(c[i],j)==j || j==x.length()){
                if(j>=x.length()-1){
                    return true;
                }else{
                    return coincide(c, x, i+1, j+c[i].length());
                }
            }else{
                return coincide(c,x,i+1,j);
            }
        }
    }
}
