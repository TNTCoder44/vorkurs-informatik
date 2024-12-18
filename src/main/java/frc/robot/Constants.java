// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class Drive {
    public static final int FRONT_RIGHT_ID = 12;
    public static final int BACK_RIGHT_ID = 13;  
    public static final int FRONT_LEFT_ID = 10; 
    public static final int BACK_LEFT_ID = 11;  

    public static final double DRIVE_MOTOR_ROTATION_M = 0.47877872 / 10.71;

    public static final double TANK_WIDTH = 0.5;
  }

  public static class Thrower {
    public static final int BOTTOM_ID = 21;
    public static final int TOP_RIGHT = 22;
    public static final int TOP_LEFT = 23;

    public static final double SHOOTER_SPEED = 0.5;
  }

  public static class Thrower2 {
    public static final int BOTTOM_ID = 22;
    public static final int TOP_RIGHT = 21;
    public static final int TOP_LEFT = 20;

    public static final double SHOOTER_SPEED = 0.5;
  }

  public static class Pickup {
    public static final int PICKUP_ID = 14;
  }

  public static class Tunnel {
    public static final int TUNNEL_ID = 15;
  }
}
