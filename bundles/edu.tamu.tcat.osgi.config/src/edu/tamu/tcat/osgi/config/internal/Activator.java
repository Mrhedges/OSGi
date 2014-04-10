package edu.tamu.tcat.osgi.config.internal;

import edu.tamu.tcat.osgi.services.util.ActivatorBase;

public class Activator extends ActivatorBase
{
   private static Activator instance;

   public Activator()
   {
      instance = this;
   }

   public static Activator getDefault()
   {
      return instance;
   }
}
