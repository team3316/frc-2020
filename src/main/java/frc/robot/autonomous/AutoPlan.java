package frc.robot.autonomous;

import com.team3316.kit.commands.DBugCommandGroup;
import frc.robot.commands.autonomous.plans.*;

public enum AutoPlan {
    None(null),
    StraightLinePlan(new StraightLinePlan()),
    BottomPortPlan(new BottomPortPlan());

    private DBugCommandGroup _plan;

    private AutoPlan(DBugCommandGroup plan) {
        this._plan = plan;
    }

    public DBugCommandGroup getPlan() {
        return this._plan;
    }
}