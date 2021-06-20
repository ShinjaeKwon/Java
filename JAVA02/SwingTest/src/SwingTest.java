import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listener1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        button.setText("버튼을 클릭하셨습니다.");
    }
}

class AddFrame extends JFrame{  //JFrame을 상속받음
    /*
    프레임을 만드는 방법은 두가지가 존재한다.
    1. 직접 JFrame f = new JFrame()와 같이 JFrame 객체를 생성하는 방법
    2. JFrame을 상속받아 새로운 프레임 클래스를 작성하는 방법
     */
    public AddFrame(){
        setTitle("당구장 관리 프로그램"); // 타이틀 설정
        setSize(1080,800); //크기 설정
        setResizable(false);	//사이즈 재조정 불가능
        setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함

        JButton button[] = new JButton[7];

        button[0] = new JButton("테이블사용");
        button[1] = new JButton("테이블사용종료");
        button[2] = new JButton("자리옮기기");
        button[3] = new JButton("시간경과");
        button[4] = new JButton("검색");
        button[5] = new JButton("전체로그출력");
        button[6] = new JButton("종 료");

        button[0].addActionListener(new Listener1());
        this.setLayout(new FlowLayout());


        this.add(button[0]); //add메서드를 통해 추가가
        this.add(button[1]);
        this.add(button[2]);
        this.add(button[3]);
        this.add(button[4]);
        this.add(button[5]);
        this.add(button[6]);

        setVisible(true);  //창이 화면에 보이게 한다.

        //x버튼 클릭시  프로그램 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class SwingTest {
    public static void main(String[] args) {
        AddFrame a = new AddFrame();
    }
}
