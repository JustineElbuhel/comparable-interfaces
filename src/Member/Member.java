package Member;

public class Member implements Comparable<Member>{

    private  String name;
    private int height;

    public Member(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return String.format("%s (%d)", name, height);
    }

    //
    @Override
    public  int compareTo(Member member){
        return this.height - member.getHeight();
    }
}
