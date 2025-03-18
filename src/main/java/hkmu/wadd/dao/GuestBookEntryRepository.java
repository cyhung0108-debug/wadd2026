package hkmu.wadd.dao;

import hkmu.wadd.model.GuestBookEntry;

import java.util.List;

public interface GuestBookEntryRepository {
    void addEntry(GuestBookEntry entry);

    void updateEntry(GuestBookEntry entry);

    List<GuestBookEntry> listEntries();

    GuestBookEntry getEntryById(long id);

    void removeEntryById(long id);
}
