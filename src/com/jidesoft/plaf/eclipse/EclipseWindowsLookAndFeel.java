/*
 * @(#)VsnetLookAndFeel.java
 *
 * Copyright 2002 JIDE Software Inc. All rights reserved.
 */
package com.jidesoft.plaf.eclipse;

import com.jidesoft.utils.SystemInfo;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.*;

/**
 * WindowsLookAndFeel with Eclipse extension
 *
 * @deprecated Due to the change in LookAndFeelFactory, this class is no longer needed.
 *             The best way to set any L&F is to use UIManager.setLookAndFeel() as usual. then call
 *             installJideExtension() or installJideExtension(int style) to add UIDefaults needed by JIDE products.
 */
public class EclipseWindowsLookAndFeel extends WindowsLookAndFeel {
    @Override
    public String getName() {
        return "Eclipse";
    }

    @Override
    public String getDescription() {
        return "The Eclipse Look And Feel";
    }

    @Override
    public String getID() {
        return "Eclipse";
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return isNativeLookAndFeel();
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return SystemInfo.isWindows();
    }

    @Override
    protected void initClassDefaults(UIDefaults table) {
        super.initClassDefaults(table);
        EclipseWindowsUtils.initClassDefaultsWithMenu(table);
    }

    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);
        EclipseWindowsUtils.initComponentDefaultsWithMenu(table);
    }
}
