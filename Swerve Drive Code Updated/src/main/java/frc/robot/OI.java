package frc.robot;

import frc.robot.commands.DriveCommand;
import frc.robot.commands.ResetGyro;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {
    /*
       Add your joysticks and buttons here
     */
    private XboxController driveController = new XboxController(0);
    private JoystickButton gyroResetButton;
    private JoystickButton driveButton;

    public OI() {
        // Back button zeroes the drivetrain
        
        gyroResetButton = new JoystickButton(driveController, 1);
        gyroResetButton.whenPressed(new ResetGyro());

        driveButton = new JoystickButton(driveController, 2);
        driveButton.whenPressed(new DriveCommand());

        // SmartDashboard Buttons
        SmartDashboard.putData("Reset Gyro", new ResetGyro());
    }

    public XboxController getDriveController() {
        return driveController;
    }
}
