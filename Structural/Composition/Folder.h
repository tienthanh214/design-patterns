#pragma once
#include "FileComponent.h"
#include <vector>

class Folder : public FileComponent {
private:
    std::vector<FileComponent*> elements;
public:
    Folder(std::string);
    ~Folder();
public:
    void add(FileComponent*);
    void remove(FileComponent*);
public:
    void showInfo();
};