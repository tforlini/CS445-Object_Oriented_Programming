package test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestWineClub.class,TestCustomer.class,TestMonthlySelection.class,TestShipments.class,TestWine.class,TestUseCases.class})
public class TestClasses {

} 