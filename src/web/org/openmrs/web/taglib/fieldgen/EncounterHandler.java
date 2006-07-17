package org.openmrs.web.taglib.fieldgen;

public class EncounterHandler extends AbstractFieldGenHandler implements FieldGenHandler {

	public String getOutput(String startingOutput) {
		String output = startingOutput;
		
		if ( fieldGenTag != null ) {
			String startVal = this.fieldGenTag.getStartVal();
			String formFieldName = this.fieldGenTag.getFormFieldName();
			
			output = "<input type=\"text\" size=\"12\" name=\"" + formFieldName + "\" value=\"" + startVal + "\" />";
			output += " (need a better widget than this - for now input Encounter id number)";
		}
		
		return output;
	}
}
