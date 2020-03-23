
class Sensor {
  public void Action() {
    System.out.println("Im a blank user");
  }
  public void ABM() {
    System.out.println("Go to alta/baja/modificacion de un sensor");
  }

}

//createUser
//deleteUser
//modifyUser

class viewStateOfSensor extends Sensor {
  public void Action() {
    System.out.println("we are going to view the state of a sensor");
  }
}

class createSensor extends Sensor {
  public void Action() {
    System.out.println("we are going to create a sensor");
  }
}
class deleteSensor extends Sensor {
  public void Action() {
    System.out.println("we are going to modify a sensor");
  }
}
class modifySensor extends Sensor {
  public void Action() {
    System.out.println("we are going to delete a sensor");
  }
}

class Sensors {
  public static void main(String[] args) {
    Sensor myUser = new viewStateOfSensor();
    Sensor myViewer = new createSensor();
    Sensor myConfigurator = new deleteSensor();
    Sensor myAdministrator = new modifySensor();

    myUser.Action();
    myViewer.Action();
    myConfigurator.Action();
    myAdministrator.Action();
  }
}
