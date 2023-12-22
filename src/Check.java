import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Stopwatch extends JFrame implements ActionListener {
    private JLabel timerLabel;
    private JButton startButton, stopButton, resetButton;
    private long startTime;
    private boolean isRunning;

    public Stopwatch() {
        setTitle("Stopwatch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(2, 1));

        timerLabel = new JLabel("00:00:00", JLabel.CENTER);
        timerLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(timerLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        add(buttonPanel);

        startTime = 0;
        isRunning = false;
    }

    public void startTimer() {
        TimerThread timerThread = new TimerThread();
        Thread thread = new Thread(timerThread);
        thread.start();
    }

    public void stopTimer() {
        isRunning = false;
    }

    public void resetTimer() {
        isRunning = false;
        startTime = 0;
        timerLabel.setText("00:00:00");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!isRunning) {
                isRunning = true;
                startTime = System.currentTimeMillis() - startTime;
                startTimer();
            }
        } else if (e.getSource() == stopButton) {
            stopTimer();
        } else if (e.getSource() == resetButton) {
            resetTimer();
        }
    }

    class TimerThread implements Runnable {
        @Override
        public void run() {
            while (isRunning) {
                long currentTime = System.currentTimeMillis() - startTime;
                int hours = (int) (currentTime / 3600000);
                int minutes = (int) ((currentTime / 60000) % 60);
                int seconds = (int) ((currentTime / 1000) % 60);

                String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                timerLabel.setText(timeString);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.setVisible(true);
        });
    }
}
