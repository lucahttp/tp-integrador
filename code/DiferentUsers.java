class User {
  public void UserSound() {
    System.out.println("Im a blank user");
  }
  public void UserLogin() {
    System.out.println("Go to login");
  }
  public void SensorCapabilities() {
    System.out.println("Don't have any permisions");
  }
  public void Rules() {
    System.out.println("Don't have any permisions");
  }
  public void CreateUser() {
    System.out.println("we are going to create a user");
  }

}

class Viewer extends User {
  public void UserSound() {
    System.out.println("Im a viewer user");
  }
  public void UserLogin() {
    System.out.println("Go to login");
  }
  public void SensorCapabilities() {
    System.out.println("Look Values of the Sensor in my location");
    Sensor myViewerUser = new viewStateOfSensor();
  }
}

class Configurator extends User {
  public void UserSound() {
    System.out.println("Im a configurator user");
  }
}

class Administrator extends User {
  public void UserSound() {
    System.out.println("Im a administrator user");
  }
}
class SuperAdministrator extends User {
  public void UserSound() {
    System.out.println("Im a Super administrator user");
  }
}


class DiferentUsers {
  public static void main(String[] args) {
    User myUser = new User();
    User myViewer = new Viewer();
    User myConfigurator = new Configurator();
    User myAdministrator = new Administrator();
    User mySuperAdministrator = new SuperAdministrator();

    myUser.UserSound();
    myViewer.UserSound();
    myConfigurator.UserSound();
    myAdministrator.UserSound();
    mySuperAdministrator.UserSound();
  }
}
