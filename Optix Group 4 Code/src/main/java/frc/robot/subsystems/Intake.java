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

public class Intake extends SubsystemBase {
    Compressor pcmCompressor = new Compressor(Constants.Intake.compressor, PneumaticsModuleType.CTREPCM);
    DoubleSolenoid doubleSolenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward1, Constants.Intake.backward1);
    DoubleSolenoid doubleSolenoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward1, Constants.Intake.backward1);
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(Constants.Intake.neoMotor, MotorType.kBrushless);

    public Intake() {
        doubleSolenoid1.set(Value.kOff);
        doubleSolenoid1.set(Value.kOff);
    }
    public void goForward () {
        doubleSolenoid1.set(Value.kForward);
        doubleSolenoid2.set(Value.kForward);
    }
    public void goBackward () {
        doubleSolenoid1.set(Value.kReverse);
        doubleSolenoid2.set(Value.kReverse);
    }
    public void compressorOn() {
        pcmCompressor.enableDigital();
    }
    
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