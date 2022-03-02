#pragma once
#include "FileComponent.h"

class File : public FileComponent{
public:
    File(std::string);
    virtual ~File();
public:
    void showInfo();
};