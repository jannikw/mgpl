/**
 * generated by Xtext 2.20.0
 */
package de.tu_dortmund.tests;

import com.google.inject.Inject;
import de.tu_dortmund.mGPL.Program;
import de.tu_dortmund.tests.MGPLInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MGPLInjectorProvider.class)
@SuppressWarnings("all")
public class MGPLParsingTest {
  @Inject
  private ParseHelper<Program> parseHelper;
  
  @Test
  public void loadModel() {
  }
}
