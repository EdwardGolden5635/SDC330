/**
 * Name: Edward Golden
 * Date: August 2026
 * Purpose: Interface defining persistence operations.
 */
public interface Storable {
    void save();
    void update();
    void delete();
    void load(int id);
}
