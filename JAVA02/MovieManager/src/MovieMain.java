public class MovieMain {
    static double checkRating(double rating){
        if(rating <0 || rating > 5){
            throw new ArithmeticException("영화등급 오류 : 0에서 5사이의 값이어야 합니다.");
        }
        return rating;
    }

    public static void main(String[] args) {
        MovieManager manager = new MovieManager("mymovies.csv","mymovies.dat"); // csv : 컴마로 분리된 형태로 저장
        try {
            manager.add(new Movie("반지의제왕", "모험", "2017.03.25", checkRating(5.5)));
            manager.add(new Movie("트랜스포머", "SF", "2017.03.25", 4.2));
            manager.add(new Movie("미드웨이", "전쟁", "2019.11.25", 4.4));
            manager.add(new Movie("해리포터", "모험", "2015.03.25", 4.5));
        /*
            manager.show();
            manager.save();
            manager.clear();
            manager.load();
            manager.show();
            */
            manager.saveObject();
            manager.loadObject();
            manager.show();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
