import java.util.*;
import java.io.*;

public class VocaTest {
    private String file;
    private File quizscore= new File("score.txt");
    private HashMap<String, String> vocas;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> scores;

    public VocaTest(String name) {
        file = name;
        vocas = new HashMap<>();
    }

    public void add() {
        String eword, kword;
        System.out.print("추가할 영어단어를 입력하세요 >>");
        eword = sc.next();
        System.out.print("영어단어 뜻을 입력하세요 >>");
        kword = sc.next();
        Voca voca = new Voca(eword, kword);
        vocas.put(voca.getEword(), voca.getKword());
        System.out.println(eword+"단어를 성공적으로 저장하였습니다.");
    }

    public void find() {
        String eword;
        System.out.print("검색할 영어단어를 입력하세요 >>");
        eword = sc.next();
        if (vocas.containsKey(eword)) {
            for (String key : vocas.keySet()) {
                if (key.equals(eword)) {
                    String value = vocas.get(key);
                    System.out.println("영어단어 : " + key + " 뜻 :" + value);
                    break;
                }
            }
        } else System.out.println("단어가 존재하지 않습니다.");
    }

    public void remove() {
        String eword;
        System.out.print("삭제할 영어단어를 입력하세요 >>");
        eword = sc.next();
        if (vocas.containsKey(eword)) {
            for (String key : vocas.keySet()) {
                if (key.equals(eword)) {
                    vocas.remove(eword);
                    break;
                }
            }
            System.out.println(eword+"단어를 성공적으로 삭제하였습니다.");
        } else System.out.println("단어가 존재하지 않습니다.");
    }

    public void load() {
        //파일 열기 (파일이 없으면 안된다)
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);
            String line;
            while ((line = buf.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                String Eword = tokenizer.nextToken();
                line = line.replace(Eword + ",", "");
                StringTokenizer tokenizer1 = new StringTokenizer(line, "\n");
                String Kword = tokenizer1.nextToken();
                vocas.put(Eword, Kword);
            }
            buf.close();
        } catch (FileNotFoundException e) {
            System.out.println(file + "파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sort() {
        TreeMap<String, String> tm = new TreeMap<String, String>(vocas);
        Iterator<String> keyiterator = tm.keySet().iterator();
        String key;
        String value;
        while (keyiterator.hasNext()) {
            key = (String) keyiterator.next();
            value = (String) tm.get(key);
            System.out.println("영어단어 : " + key + " 뜻 :" + value);
        }
    }

    public void quiz() {
        String word;
        int cnt;
        int score = 0;
        System.out.println("영어 암기 퀴즈를 시작합니다. 시험보기 원하는 단어의 갯수를 입력하세요.");
        System.out.print("갯수입력 >>");
        cnt = sc.nextInt();
        System.out.println(cnt + "개의 단어시험을 시작합니다.");
        for (int i = 0; i < cnt; i++) {
            ArrayList keys = new ArrayList(vocas.keySet());
            Collections.shuffle(keys);
            String ewordquiz = keys.get(i).toString();
            System.out.println("영어단어 : " +ewordquiz);
            String kwordquiz = vocas.get(ewordquiz);
            System.out.print("뜻을 입력하세요 :");
            word = sc.next();
            sc.nextLine();
            if (kwordquiz.contains(word)) {
                System.out.println("정답입니다!!");
                score++;
            } else {
                System.out.println("오답입니다.");
            }
        }   //for 끝*/
        System.out.println("정답의 갯수는 :"+score+"입니다.");
        try {
            if(!quizscore.isFile()) {
                FileWriter writer = new FileWriter(quizscore); //처음기록이면 파일을 생성, 파일이 있으면 파일의 내용을 삭제
                BufferedWriter buf = new BufferedWriter(writer);
                buf.write(score);
                buf.newLine();
                buf.close();
            }
            else {
                FileWriter writer = new FileWriter(quizscore,true);
                BufferedWriter buf = new BufferedWriter(writer);
                buf.write(Integer.toString(score));
                buf.newLine();
                buf.close();
            }

        } catch (IOException e) {
            System.out.println(quizscore+"파일에 접근 오류입니다.");
            e.printStackTrace();
        }
    }

    public void quizResult(){
        try {
            FileReader reader = new FileReader(quizscore);
            BufferedReader buf = new BufferedReader(reader);
            String line;
            scores = new ArrayList<Integer>();
            while ((line = buf.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, "\n");
                String quizscore = tokenizer.nextToken();
                scores.add(Integer.parseInt(quizscore));
            }
            buf.close();
        } catch (FileNotFoundException e) {
            System.out.println(file + "파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i=1;
        for(int num : scores){
            System.out.println(i+"번째 시험점수는 "+num+" 입니다.");
            i++;
        }
    }
}
