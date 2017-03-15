package Decorate;

/**
 * Created by SHYRIK on 13.02.2017.
 */
public class DecoratorMain {
    public static void main(String[] args) {
//        QaWork qaWork = new QaTeamLeader(new QaSenior(new QaDecoration(new Qa("я начинающий специалсит"))));
//        qaWork.work();




    }
}




//interface QaWork{
//    void work();
//}
//class Qa implements QaWork{
//    String value;
//
//    public Qa(String value) {
//        this.value = value;
//    }
//
//    @Override
//    public void work() {
//        System.out.println(value);
//    }
//}
//
//class QaDecoration implements QaWork {
//    QaWork qaWork;
//
//    public QaDecoration(QaWork qaWork) {
//        this.qaWork = qaWork;
//    }
//
//    @Override
//    public void work() {
//         qaWork.work();
//         System.out.println("я костяк команды спустя год");
//    }
//}
//class QaSenior implements QaWork {
//    QaWork qaWork;
//
//    public QaSenior(QaWork qaWork) {
//        this.qaWork = qaWork;
//    }
//
//    @Override
//    public void work() {
//       qaWork.work();
//       System.out.println("я  уже делаю очень сложную работу");
//    }
//}
//
//class QaTeamLeader implements QaWork {
//    QaWork qaWork;
//
//    public QaTeamLeader(QaWork qaWork) {
//        this.qaWork = qaWork;
//    }
//
//    @Override
//    public void work() {
//        qaWork.work();
//        System.out.println("я руководитель QA-Team, теперь мне джину носят чай ");
//    }
//}
//


