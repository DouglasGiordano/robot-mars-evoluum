package br.com.evoluum.giordano.robotevoluum.service;

import br.com.evoluum.giordano.robotevoluum.model.Robot;
import org.springframework.stereotype.Service;

/**
 * @author Douglas Montanha Giordano
 */
@Service
public class RobotService {
    private final int MAX_X = 5;
    private final int MAX_Y = 5;

    /**
     * Move robot
     * @param robot
     * @param steps
     * @return status robot
     * @throws Exception
     */
    public String move(Robot robot, String steps) throws Exception {
        this.validateSteps(steps);
        for (char step : steps.toCharArray()) {
            switch (step) {
                case 'M':
                    robot.move();
                    break;
                case 'R':
                    robot.moveDirectionRight();
                    break;
                case 'L':
                    robot.moveDirectionLeft();
                    break;
            }
            this.checkLimit(robot);
        }
        return "(" + robot.getX() + ", " + robot.getY() + ", " + robot.getDirection() + ")";
    }

    /**
     * Checks if the pattern of the robot steps is using R, L or M.
     * @param steps
     * @throws Exception
     */
    public void validateSteps(String steps) throws Exception {
        boolean valid = steps.matches("[MLR]*");
        if(!valid){
            throw new Exception("Is not valid.");
        }
    }

    /**
     * Checks the field boundary.
     * @param robot
     * @throws Exception
     */
    public void checkLimit(Robot robot) throws Exception {
        if(robot.getY() > MAX_Y){
            throw new Exception("Limit max y = 5.");
        } else if (robot.getX() > MAX_X){
            throw new Exception("Limit max x = 5.");
        }
    }
}
