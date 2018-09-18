package fr.inria.coming.core.interfaces;

/**
 * A filter to establish if a Commit, a list of Fragments or a lone fragment matches with specifics criteria
 *
 */
public interface IFilter {
	boolean acceptCommit(Commit c);
	boolean acceptFragment(String fragment);
}