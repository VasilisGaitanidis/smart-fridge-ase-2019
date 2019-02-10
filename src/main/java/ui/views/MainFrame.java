package main.java.ui.views;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

@Component
public class MainFrame extends JFrame {

    private JPanel contentPane;
	private JButton profileButton;
	private JButton fridgeButton;
	private JButton exitButton;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public MainFrame() {

        try {
            setIconImage(Toolkit.getDefaultToolkit().getImage(new ClassPathResource("/images/fridge.png").getURL()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

		this.setTitle("Smart Fridge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		contentPane.add(panel, BorderLayout.SOUTH);

		profileButton = new JButton("My Profile");
		profileButton.setForeground(Color.WHITE);
		profileButton.setBackground(new Color(30, 144, 255));
		profileButton.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 18));

		exitButton = new JButton("Exit");

		exitButton.setForeground(Color.WHITE);
		exitButton.setBackground(new Color(30, 144, 255));
		exitButton.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 18));

		fridgeButton = new JButton("MY FRIDGE");
		fridgeButton.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 18));
		fridgeButton.setForeground(new Color(255, 255, 255));
		fridgeButton.setBackground(new Color(30, 144, 255));

		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
        try {
            lblNewLabel.setIcon(new ImageIcon(new ClassPathResource("/images/refrigerator.png").getURL()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(61)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addGap(135)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(exitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(profileButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(fridgeButton, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
					.addGap(90))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(108)
							.addComponent(profileButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(fridgeButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(74)
							.addComponent(lblNewLabel)))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

    public JButton getProfileButton() {
        return profileButton;
    }

    public JButton getFridgeButton() {
        return fridgeButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }
}