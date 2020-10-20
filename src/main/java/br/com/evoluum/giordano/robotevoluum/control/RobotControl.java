package br.com.evoluum.giordano.robotevoluum.control;

import br.com.evoluum.giordano.robotevoluum.model.Robot;
import br.com.evoluum.giordano.robotevoluum.service.RobotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @author Douglas Montanha Giordano
 */
@RestController
@RequestMapping("/rest/mars")
public class RobotControl {
    @Inject
    private RobotService robotService;

    /**
     * Service to move the robot.
     * @param steps
     * @return status robot
     * @throws Exception
     */
    @GetMapping("/{steps}")
    public String getRobotStatus(@PathVariable(value = "steps", required = true) String steps) throws Exception {
            Robot robot = new Robot();
            String result = robotService.move(robot, steps);
            return result;
    }
}
