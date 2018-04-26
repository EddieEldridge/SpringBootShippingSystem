![springbootshippingsystem](https://user-images.githubusercontent.com/22448079/38827335-82e385ac-41aa-11e8-8dbb-59716fa7d2a2.png)

<p align="center">
  <b>A Spring Boot MVC application that allows a user to manage Ships, Shipping Companies and Orders.</b><br>
</p>

## Contents
* [Description](#description)
* [How to run](#how-to-run-the-program)
* [Information](#information)
* [Technologies](#technologies)
* [Software](#Software)
* [Resources](#resources)

## Description
The aim of this project was to develop a Spring Boot application that uses the Spring MVC n-tier architecture – Controllers, Services, Repositories, Views, with the appropriate data/logic in each tier.

The Model for the application consists of three objects
* <b>Ship</b>
	* Number of Passengers
	* Ship ID
  * Name
  * Cost
  * Size(Meters)
  * Associated Shipping Company
* <b>Shipping Company</b>
	* Shipping Company ID
	* Name
	* Home Port
	* Company Balance
  * Associated Ships
  * Assoociated Orders
 * <b>Order Info</b>
	* Order ID
	* Associated Shipping Company
	* Associated Ship
	* Order Date

## How to run the program

### Clone/Download
To clone the repository to your local machine, using your prefered command prompt, navigate to the folder you wish to download the files to and enter
```
git clone https://github.com/EddieEldridge/SpringBootShippingSystem.git
```
<b>OR</b>

Use the green clone button and extract the contents of the .zip to a folder of your choice.

### Run
The program can be launched by importing the project in Eclipse and running it as a Spring Boot application.

Please ensure you have [Spring Tools](https://marketplace.eclipse.org/content/spring-tools-aka-spring-ide-and-spring-tool-suite) installed in your Eclipse.

Once the project is running in Eclipse, navigate to http://localhost:8080/ in your browser. From here you can use the program.


## Information
For more information on concepts discussed and used in this program, please refer to the [Wiki](https://github.com/EddieEldridge/UnityZephyr/wiki) and resources below.

## Technologies
- [Java](https://java.com/en/download/)
- [Spring](https://projects.spring.io/spring-framework/)
- [MySQL](https://www.mysql.com/)

## Software
- [Eclipse](https://www.eclipse.org/)
- [Cmder](http://cmder.net/)
- [Wamp Server](http://www.wampserver.com/en/)

## Resources
- [Spring with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## Developers
Edward Eldridge (G00337490)
