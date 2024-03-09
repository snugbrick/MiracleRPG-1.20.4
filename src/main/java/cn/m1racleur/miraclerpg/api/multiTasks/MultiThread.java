package cn.m1racleur.miraclerpg.api.multiTasks;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2024.03.08 23:39
 */
public class MultiThread extends Thread {
    public void runTasks(Runnable tasks) {
        new Thread(tasks).start();
    }

    public void runTasksLate(Runnable tasks, int tick) {
        Thread thread = new Thread(() -> {
            tasks.run();
            try {
                Thread.sleep(tick * 1000L);//转换为游戏刻
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
    }
}
