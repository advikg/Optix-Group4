// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Intake.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** 
 * @author Chilliam Weng
 * 
 * Command to turn on the compressor
 */
public class Compressor extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Intake intake;

  /**
   * Creates a new Compressor.
   *
   * @param intake The intake used by this command.
   */
  public Compressor(Intake intake) {
    this.intake = intake;
    // Use addRequirements() here to declare intake dependencies.
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      intake.compressorOn();
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.compressorOff();
   }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
