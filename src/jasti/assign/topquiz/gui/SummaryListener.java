/**
 * 
 */
package jasti.assign.topquiz.gui;

import jasti.assign.topquiz.gui.ScoreSummary;

/**
 * Facilitate communication between question panel and summary panel
 * @author Priya
 * 
 */
public interface SummaryListener {
	
	public void quizEnded(ScoreSummary summary);
	

}
