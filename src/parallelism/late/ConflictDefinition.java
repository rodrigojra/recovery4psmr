/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelism.late;

import parallelism.late.graph.Request;
import parallelism.MessageContextPair;
import parallelism.ParallelMapping;

/**
 *
 * @author eduardo
 */
public abstract class ConflictDefinition {

    public ConflictDefinition() {
    }
 
     public abstract boolean isDependent(MessageContextPair r1, MessageContextPair r2);
    
    
    
}
