package company;

import java.util.Arrays;

public class Engineer extends Employee{
    private String[] skills;

    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String skill) {
        String[] temp = new String[skills.length +1];
        for (int i = 0; i < skills.length; i++) {
            temp[i] = skills[i];
        }
        temp[temp.length-1] = skill;
        this.skills = temp;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s Position: Engineer\t Skills: %s", "", Arrays.toString(skills));
    }


}
