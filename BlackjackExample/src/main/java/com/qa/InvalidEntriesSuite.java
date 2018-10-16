package com.qa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({bustPartition.class, invalidPartition.class})

public class InvalidEntriesSuite {

}
