package ObserverPublisher;

import java.util.ArrayList;

/**
 * Created by SHYRIK on 12.03.2017.
 */
public class MainPublisher {
    public static void main(String args[]){
//       WorkUa workUa = new WorkUa();
//        workUa.add(new User("Vaska"));
//        workUa.add(new User("Petro"));
//        workUa.add(new User("Sasha"));
//        workUa.setInformation("QA");
//        workUa.showInfo();

        GlovalLogic glovalLogic = new GlovalLogic();
        glovalLogic.addIUser(new User("SHYRIK","QA"));
        glovalLogic.addIUser(new User("Vaska","QA"));
        glovalLogic.addIUser(new User("Vitalui","QA"));
        glovalLogic.addIUser(new User("Inna","QA"));
        glovalLogic.addIUser(new User("Petro","QA"));
        glovalLogic.addIUser(new User("Alex","QA"));
        glovalLogic.addIUser(new User("Djo","DEV"));
        glovalLogic.setInfo("QA");
        glovalLogic.showinf0();


    }
}

//interface Izdatel {
//    void add(IUser user);
//    void remove(IUser user);
//    void showInfo();
//}
//
//class WorkUa implements  Izdatel{
//    String information;
//    public void setInformation(String information) {this.information = information;}
//    ArrayList<IUser> list = new ArrayList<>();
//    @Override
//    public void add(IUser user) {
//       list.add(user);
//    }
//    @Override
//    public void remove(IUser user) {
//        list.remove(user);
//    }
//    @Override
//    public void showInfo() {
//       for(IUser x:list){
//           x.show(information);
//       }
//    }
//}
//
//interface IUser{
//    void show(String information);
//}
//class User implements IUser {
//     String name;
//    public User(String name) {
//        this.name = name;
//    }
//    @Override
//    public void show(String information) {
//           System.out.println(name +" полчились сообщения о " + " новая ваканция :" + information);
//    }
//}


interface Izdael {
    void addIUser(IUser user);
    void removeUser(IUser user);
    void showinf0();
}
class GlovalLogic implements Izdael {
     String position;
     String info;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    ArrayList<IUser> list = new ArrayList<>();
     @Override
     public void addIUser(IUser user) {
        list.add(user);
    }

    @Override
    public void removeUser(IUser user) {
       list.remove(user);
    }

    @Override
    public void showinf0() {
       for(IUser x:list){
           x.showinf(info,position);
       }
    }
}
interface IUser{
    void showinf(String info,String position);
}
class User implements IUser {
    String name;
    String pos;

    public User(String name, String pos) {
        this.name = name;
        this.pos = pos;
    }

    @Override
    public void showinf(String info, String position) {
              if(position.equals(info)) {
                  System.out.println(name + " У нас появилась новая ваканция " + info);
              }
      }
}



