
package com.codestudioapps.cardioexcercise.WalkandStep;

import android.content.pm.PackageManager;

import com.codestudioapps.cardioexcercise.WalkandStep.services.AbstractStepDetectorService;
import com.codestudioapps.cardioexcercise.WalkandStep.services.AccelerometerStepDetectorService;
import com.codestudioapps.cardioexcercise.WalkandStep.services.HardwareStepDetectorService;
import com.codestudioapps.cardioexcercise.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
