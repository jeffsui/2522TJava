package asjy.base.day5;

public class FuncDemo1 {
    public static void main(String[] args) {
        //step 1 把冰箱门打开
        open_door();
        //step 2. 把大象装进去
        push_daxiang();
        //step 3. 把冰箱门关上
        close_door();
    }

    private static void close_door() {
        System.out.println("第三步：关上冰箱门");
    }

    private static void push_daxiang() {
        System.out.println("第二步:把大象装进去");
    }

    private static void open_door() {
        System.out.println("第一步:打开冰箱门");
    }
}
