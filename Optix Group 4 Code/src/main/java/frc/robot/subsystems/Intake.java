package frc.robot.subsystems;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Intake extends SubsystemBase {
    DoubleSolenoid doubleSolenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward1, Constants.Intake.backward1 );
    DoubleSolenoid doubleSolenoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.forward2, Constants.Intake.backward2 );
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);

    public void compressorOn() {
        pcmCompressor.enableDigital();
    }

    public void compressorOff() {
        pcmCompressor.disable();
    }
    // Neo Motor Can Spark Max
    CANSparkMax neoMotorCanSparkMax = new CANSparkMax(0, MotorType.kBrushless);

    public void setNeo(double speed){
        neoMotorCanSparkMax.set(speed);
    }
    public Intake() {
        doubleSolenoid1.set(Value.kOff);
        doubleSolenoid2.set(Value.kOff);
    }
}