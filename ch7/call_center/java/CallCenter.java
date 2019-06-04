import java.util.*;

public class CallCenter{
    ArrayList<Respondent> respondents;
    ArrayList<Manager> managers;
    ArrayList<Director> directors;
    ArrayList<Integer> callHolds;
    CallCenter(){
        respondents = new ArrayList<Respondent>();
        managers = new ArrayList<Manager>();
        directors = new ArrayList<Director>();
        callHolds = new ArrayList<Integer>();
    }
    public void addEmployee(Respondent r){
        respondents.add(r);
    }
    public void addEmployee(Manager m){
        managers.add(m);
    }
    public void addEmployee(Director d){
        directors.add(d);
    }
    public void dispatchCall(){
        for(int i = 0; i < respondents.size(); i++){
            if(!respondents.get(i).isOnCall){
                respondents.get(i).setCall(true);
                return;
            }
        }
        for(int i = 0; i < managers.size(); i++){
            if(!managers.get(i).isOnCall){
                managers.get(i).setCall(true); 
                return;
            }
        }
        for(int i = 0; i < directors.size(); i++){
            if(!directors.get(i).isOnCall){
                directors.get(i).setCall(true);
                return;
            }
        }
        callHolds.add(1);
    }
}
