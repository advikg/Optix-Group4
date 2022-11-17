package frc.robot.subsystems;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    DoubleSolenoid doubleSolenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward1, Constants.Intake.backward1);
    DoubleSolenoid doubleSolenoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward1, Constants.Intake.backward1);

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
    @Override
    public void periodic() {
        CompressorOn();
    }
    public void CompressorOn() {
        pcmCompressor.enableDigital();
    }

    public void CompressorOff() {
        pcmCompressor.disable();
    }


    // Neo Motor Can Spark Max
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(0, MotorType.kBrushless);

    public void setNeo(double speed){
        neoMotorCanSparkMax.set(speed);
    }
}
