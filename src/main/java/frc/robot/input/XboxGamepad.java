package frc.robot.input;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * <p>IGamepad implementation for XBox-like gamepads.</p>
 *
 * <p>Currently known to work with:
 * <ul>
 *      <li>Xbox 360 wired controller</li>
 *      <li>Logitech F310</li>
 * </ul>
 * </p>
 *
 * @author Jacob Bublitz
 * @since 1.0
 */

public final class XboxGamepad extends Joystick implements IGamepad {
	
	
	private final Button[] mButtons = {
			new JoystickButton(this, 2), // A Button
			new JoystickButton(this, 3), // B Button
			new JoystickButton(this, 1), // X Button
			new JoystickButton(this, 4), // Y Button

			new JoystickButton(this, 5), // Left Bumper
			new JoystickButton(this, 6), // Right Bumper

			new JoystickButton(this, 11), // Left Stick Button
			new JoystickButton(this, 12), // Right Stick Button

			new JoystickButton(this, 9), // Back Button
			new JoystickButton(this, 10), // Start Button

			new AxisButton(this, 4, 0.75), // Left Trigger
			new AxisButton(this, 5, 0.75), // Right Trigger
	};

	private final DPadButton[] mDPadButtons;

	/**
	 * @param port The port the controller is on
	 */
	public XboxGamepad(int port) {
		super(port);

		mDPadButtons = new DPadButton[DPadButton.Direction.values().length];

		for (DPadButton.Direction dir : DPadButton.Direction.values()) {
			mDPadButtons[dir.ordinal()] = new DPadButton(this, dir);
		}
	}

	public double getLeftTriggerValue() {
		return getRawAxis(4);
	}

	public double getLeftXValue() {
		return getRawAxis(0);
	}

	public double getLeftYValue() {
		return -getRawAxis(1); //was (-)
	}

	public double getRightTriggerValue() {
		return getRawAxis(5);
	}

	public double getRightXValue() {
		return getRawAxis(2);
	}

	public double getRightYValue() {
		return -getRawAxis(3); //was (-)
	}

	public Button getAButton() {
		return mButtons[2];
	}

	public Button getBButton() {
		return mButtons[3];
	}

	public Button getXButton() {
		return mButtons[1];
	}

	public Button getYButton() {
		return mButtons[4];
	}

	public Button getLeftBumperButton() {
		return mButtons[5];
	}

	public Button getRightBumperButton() {
		return mButtons[6];
	}

	public Button getBackButton() {
		return mButtons[9];
	}

	public Button getStartButton() {
		return mButtons[10];
	}

	public Button getLeftJoystickButton() {
		return mButtons[11];
	}

	public Button getRightJoystickButton() {
		return mButtons[12];
	}

	public Button getLeftTriggerButton() {
		return mButtons[7];
	}

	public Button getRightTriggerButton() {
		return mButtons[8];
	}

	public Button getDPadButton(DPadButton.Direction direction) {
		return mDPadButtons[direction.ordinal()];
	}
}
