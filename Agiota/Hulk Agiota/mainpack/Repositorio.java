package mainpack;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Repositorio<K, T>{
    Map<K, T> data;
    String nametype;

    public Repositorio(String nametype) {
        this.nametype = nametype;
        this.data = new TreeMap<K, T>();
    }

    public void add (K key, T t){
        if (data.get(key) == null)
            data.put(key, t);
        else   
            throw new RuntimeException(nametype + " " + key + " ja existe");
    }

    public T get(K key){
        if (data.get(key) != null)
            return data.get(key);
        else
            throw new RuntimeException(nametype + " " + key + " nao existe");
    }

    public void remove(K key){
        if (data.get(key) != null){
            System.out.println("removendo " + key);
            data.remove(key);
        }else  
            throw new RuntimeException(nametype + " " + key + " nao existe, nao pode ser removido");
    }

    public ArrayList<T> getAll(){
		ArrayList<T> out = new ArrayList<T>();
		for(K key : data.keySet())
			out.add(data.get(key));
		return out;
	}


}