import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MovieManager {
    private ArrayList<Movie> movies = new ArrayList<>();
    private String file,file2;
    public MovieManager (String name, String name2){
        file = name; //파일명을 받음
        file2 = name2;
    }

    public void add(Movie movie){
        movies.add(movie);
    }
    public void show(){
        for(Movie movie : movies) System.out.println(movie);
    }
    public void clear(){
        movies.clear();  //모든 데이터 삭제
    }
    public void save(){ //file 에 있는 파일명으로 데이터 저장
        //파일 열기(스트림 생성)
        //파일에 기록하기
        //파일닫기
        //try ~ catch 구문 : 예외처리 구문,
        try{
            FileWriter writer = new FileWriter(file); //처음기록이면 파일을 생성, 파일이 있으면 파일의 내용을 삭제
            BufferedWriter buf = new BufferedWriter(writer);
            for(Movie movie  : movies){
                buf.write(movie.getTitle()+",");
                buf.write(movie.getGenre()+",");
                buf.write(movie.getRelease()+",");
                buf.write(Double.toString(movie.getRating())); //double타입을 String으로 바꿔줌
                buf.newLine(); //다음 줄로 (엔터와 동일)
            }
            buf.close(); //save
        }catch (IOException e){
            System.out.println(file+"파일에 접근 오류입니다.");
            e.printStackTrace();
        }
    }
    public void load(){
        //파일 열기 (파일이 없으면 안된다)
        try{
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);
            String line;
            while((line = buf.readLine()) != null){
                StringTokenizer tokenizer = new StringTokenizer(line,",");
                String title = tokenizer.nextToken();
                String gerne = tokenizer.nextToken();
                String release = tokenizer.nextToken();
                double rating = Double.parseDouble(tokenizer.nextToken());
                movies.add(new Movie(title, gerne, release, rating));
            }
            buf.close();
        }catch (FileNotFoundException e){
            System.out.println(file+ "파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //바이트 스트림으로 객체 덩어리 저장
    public void saveObject(){
        try{
            FileOutputStream fos = new FileOutputStream(file2);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            for(Movie movie : movies) os.writeObject(movie); //file2에 Movie 객체를 기록하는 것
            os.flush(); //버퍼에 기록된 데이터를 파일로 기록하기
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { //아래쪽으로 내려갈수록 더 넓은 개념이다. 넓은 개념이 아래로 가야한다.
            e.printStackTrace();
        }
    }
    public void loadObject(){
        Movie movie;
        movies.clear(); //전체 삭제
        try{
            FileInputStream fis =  new FileInputStream(file2);
            ObjectInputStream is = new ObjectInputStream(fis);
            while((movie  = (Movie) is.readObject()) != null) { //Object -> Movie
                movies.add(movie);
            }
            is.close();
        } catch(EOFException e){
            System.out.println("영화 데이터를 성공적으로 읽어들였습니다.");
        }catch (FileNotFoundException e) {
            System.out.println(file2+" 파일이 존재하지 않습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
