package ku.cs.models;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        score = 0;
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void changeName(String name) {
        if (!name.trim().equals("")) {
            this.name = name.trim();
        }
    }

    public void addScore(double score) {
        if (score > 0) {
            this.score += score;
        }
    }

    // TODO: design grading system for Student
    public String grade() {
        if(score >= 80) {
            return "A";
        } else if(score >= 70) {
            return "B";
        } else if(score >= 60) {
            return "C";
        } else if(score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isId(String id) {
        return this.id.equals(id);
    }

    public boolean isNameContains(String name) {
        return this.name.toLowerCase().contains(name.toLowerCase());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade();
    }

    @Override
    public String toString() {
        return "{" +
                "id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", score: " + score +
                '}';
    }
}