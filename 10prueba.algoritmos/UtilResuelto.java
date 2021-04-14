import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;

public class UtilResuelto 
{
    public static HashMap<Integer,Integer> encontrarPareja(int[] numeros, int sum) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int n:numeros) 
        {
            if (hs.contains(sum - n))
                hm.put(n, sum-n);
            hs.add(n);
        }
        return hm;
    }

    public static HashMap<Integer, Integer> escribirParejasSimetricas(HashMap<Integer,Integer> hm) 
    {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for (Map.Entry<Integer,Integer> m : hm.entrySet())
            if(hm.containsKey(m.getValue()) && hm.get(m.getValue())==m.getKey())
                hm1.put(m.getKey(),m.getValue());
        return hm1;
    }

    public static HashMap<Integer, Integer> escribirParejasSimetricasSinDuplicados(HashMap<Integer, Integer> hm) 
    {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for (Map.Entry<Integer,Integer> m : hm.entrySet())
            if(hm.containsKey(m.getValue()) && hm.get(m.getValue())==m.getKey() && !hm1.containsKey(m.getValue()))
                hm1.put(m.getKey(),m.getValue());
        return hm1;
    }

    public static boolean tieneTodosNumConsecutivos(int[] numerosAleatorios) 
    {
        ArrayList<Integer> numerosOrdenados = new ArrayList<>();
        int minNumero = Integer.MIN_VALUE;
        for(int num:numerosAleatorios)
        {
            if (num >= minNumero) 
            {   
                numerosOrdenados.add(num);
                minNumero = num;                
            }
        }
        
        if (numerosOrdenados.size()==numerosAleatorios.length)
            return true;
        else
            return false;
    }
}