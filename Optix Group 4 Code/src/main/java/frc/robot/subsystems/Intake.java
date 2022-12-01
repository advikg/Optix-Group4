package frc.robot.subsystems;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * @author Chilliam Weng
 * @author Advik Garg
 * @author Don Tran
 * 
 * This code is for the Intake subsystem, it defines the solenoids, neo motors, and compressor and contains all the necessary methods
*/
public class Intake extends SubsystemBase {
    private Compressor pcmCompressor = new Compressor(Constants.Intake.compressor, PneumaticsModuleType.CTREPCM);
    private DoubleSolenoid doubleSolenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward1, Constants.Intake.backward1);
    private DoubleSolenoid doubleSolenoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward2, Constants.Intake.backward2);
    private CANSparkMax neoMotorCanSparkMax = new CANSparkMax(Constants.Intake.neo_motor, MotorType.kBrushless);


    // Initial constructor to turn off the solenoids at the start
    public Intake() {
    }

    // Extends the intake using the double solenoids
    public void goForward () {
        doubleSolenoid1.set(Value.kForward);
        doubleSolenoid2.set(Value.kForward);
    }

    // Retracts the intake using the double solenoids
    public void goBackward () {
        doubleSolenoid1.set(Value.kReverse);
        doubleSolenoid2.set(Value.kReverse);
    }

    // Turns on compressor
    public void compressorOn() {
        pcmCompressor.enableDigital();
    }
    
    // Turns off compressor
    public void compressorOff() {
        pcmCompressor.disable();
    }
    // Neo Motor Can Spark Max
    public void setNeo(double speed){
        neoMotorCanSparkMax.set(speed);
    }
    @Override
    public void periodic() {
        compressorOn();
    }
}
