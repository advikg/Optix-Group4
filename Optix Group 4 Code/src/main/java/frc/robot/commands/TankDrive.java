package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;


public class TankDrive extends CommandBase {
    private final Drivetrain driveTrain;
    private DoubleSupplier right;
    private DoubleSupplier left;

    public TankDrive (Drivetrain drivetrain, DoubleSupplier right, DoubleSupplier left ) {
        this.driveTrain = drivetrain;
        this.right = right;
        this.left = left;
        addRequirements(drivetrain);
    }
    // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrain.tankDrive(right.getAsDouble(), left.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}
}