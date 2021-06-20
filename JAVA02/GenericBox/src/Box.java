public class Box <T> { // T : Type, E : Element, K : key, V : value
    private T[] data;`
    private int cnt;

    public Box(T[] arr){
        data = arr;
        cnt  = 0;

    }

    public void put(T e){
      if(cnt<data.length)
          data[cnt++] = e;
    }
    public T get(int pos){
        return (pos<cnt) ? data[pos] : null;
    }


    public void show(){
        for(int i = 0 ; i < cnt; i++) System.out.println(data[i]);
    }
    public int capacity(){
        return data.length;
    }
    public void sizeup(T[] arr){
        for(int i = 0; i<cnt; i++) arr[i] = data[i];
        data = arr;
    }
    public void remove(int pos){
        cnt--;
        for(int i=pos; i<cnt; i++) data[i] = data[i+1];
    }
    public void clear(){
        cnt = 0;
    }
}
