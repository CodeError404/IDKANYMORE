package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 6; //Supposed to be 7
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 7; //Supposed to be 6
    
	public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 5;
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 4;

    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 1; //Supposed to be 0
    public static final int DRIVETRAIn_BACK_LEFT_ANGLE_MOTOR = 0; //Supposed to be 1

    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 3; //Supposed to be 2
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 2; //Supposed to be 3

}
