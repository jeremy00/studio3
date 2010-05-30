package com.aptana.syncing.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(LocalSyncingTests.class);
		suite.addTestSuite(FTPSyncingTests.class);
		suite.addTestSuite(SFTPSyncingTests.class);
		suite.addTestSuite(LocalLargeSampleSyncingTests.class);
		suite.addTestSuite(FTPLargeSampleSyncingTests.class);

		// $JUnit-END$
		return suite;
	}
}
