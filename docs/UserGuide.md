---
layout: default.md
title: "User Guide for LinkTree"
pageNav: 3
---

# LinkTree User Guide

LinkTree is a **desktop app optimized for developers engaged in startups** who require organized and streamlined 
methods for contact management. With LinkTree, swiftly connect with the right stakeholder, ensuring smooth 
project execution and superior collaboration.

This user guide is designed to help our users to understand and make the most of out of LinkTree. This guide is to 
provide clear and comprehensive instructions, to assist our users in understanding the core features and functions of
LinkTree application. It is your **companion** for unlocking the full potential of LinkTree to effectively manage your
teams.

**Value Proposition**:
LinkTree is the top contact solution for software professionals. Using our unique tag-based system and tree structure,
you can access contacts by roles and responsibilities instantly.

## Table of Contents
* [Introduction](#introduction)
  * [Target User Profile](#target-user-profile)
  * [How to use this Guide?](#how-to-use-this-guide)
* [Getting Started](#getting-started)
  * [Installation](#installation)
  * [Initial Setup](#initial-setup)
  * [Understanding the GUI](#understanding-the-gui)
  * [Tutorial on using our Commands](#tutorial-on-using-our-commands)
* [Features](#features)
  * [Welcome to Linktree](#welcome-to-linktree)
  * [Managing developers](#managing-developers)
    * [Add developer](#add-developer)
    * [Remove developer](#remove-developer)
    * [Edit developer](#edit-developer)
    * [Find developer](#find-developer)
    * [List developers](#list-developers)
  * [Managing teams](#managing-teams)
    * [Create teams](#create-teams)
    * [Add developer to team](#add-developers-to-team)
    * [Delete teams](#delete-team)
    * [Remove developer from team](#remove-developer)
    * [Edit team name](#edit-team-name)
    * [Edit team leader](#edit-team-leader)
    * [Find team](#find-team)
    * [List teams](#list-teams)
  * [Display tree](#display-tree)
  * [Help](#help)
  * [Reset the project](#reset-the-project)
  * [Exit the application](#exit-the-application)
* [Troubleshooting](#troubleshooting)
* [FAQs](#faqs)
* [Support](#support)
* [Known issues](#known-issues)
* [Command Summary](#command-summary)
* [Future Enhancement](#future-enhancement)

<page-nav-print />

--------------------------------------------------------------------------------------------------------------------

## Introduction

### Target User Profile
- Project managers and Developers who are engaged in startups.
- Collaborates frequently with multiple teams or departments.
- Requires quick access to contact details of other team members based on their roles and responsibilities.
- Prefers an organized and streamlined method for contact management.
- Tech-savvy and open to adopting new tools for enhancing productivity.

### How to use this Guide?

**Navigating the Document**: This guide is divided into sections to help you quickly find the information you need. You
can use the table of contents to jump from one section to another section. Additionally, headings and subheadings are
used for easy navigation.

**Formatting and Icons**: Throughout the guide, we use bold text and colors to emphasize key points and important terms.
Icons are used to draw your attention to noteworthy tips and additional information.

Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## Getting Started

### Installation

1. Ensure you have Java `11` or above installed on your Computer.
2. LinkTree is compatible with all major operating systems, including Windows, macOS and Linux.
3. Download the latest `LinkTree.jar` from [here](https://github.com/AY2324S1-CS2103T-W11-4/tp/releases).
4. Copy the file to the folder you wish to use as the _home folder_ for your smart contact book.

### Initial Setup

1. Open a command terminal, `cd` into the folder where you placed the jar file, and use the `java -jar addressbook.jar` command to run the application. A GUI similar to the one below should appear in a few seconds, containing some sample data.
   ![Ui](images/Ui.png)

2. Type a command into the command box and press Enter to execute it. For example. type `help` in the command box and press Enter.
It will open a new help window, and shows a command summary in the result box.

3. Refer to the [Basic Features](#basic-features) and [Advanced Features](#advanced-features) sections for details of each command.


### Understanding the GUI

 ![Understanding GUI](images/UG_images/Understanding%20GUI.png)

Our GUI is simple and easy to understand.
1. **Command Box**: You have to type your commands in this box.
2. **Result Display**: Based on the inputs given, your result will be displayed in this box.
3. **Help Button**: If you are unsure, you can type `help` in the command box and you will see a help window pop up. 
Copy this URL to have a look at our user guide.
4. **Developers Panel**: Lists all the developers from your addressbook.
5. **Teams Panel**: Lists all the teams from your teambook.

### Tutorial on using our Commands
Will update soon...


Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## Features

### Welcome to LinkTree

#### What this command does:
* The "Hi" command displays a welcome message along with the current date and time.

Format: `Hi`

##### Features:

- When the command is invoked, it returns a greeting from Linktree and the current date and time.
- The output format is consistent, showing "Welcome from Linktree, Current date and time: MM-DD-YYYY HH:MM:SS".

##### Guidelines:

- Please ensure that the first letter of the command is uppercase. For instance, use `Hi` instead of `hi` or `HI`.
- The command does not take any additional arguments or keywords.

##### Examples:

When you enter the command (Hi):

  ![Welcome](images/UG_images/Hi.png)

### Managing Developers

### Add developer
#### What this command does:
* Allows you to add developer information into the storage.

##### Command format: 
* `add n/[Developer Name] p/[Phone Number] e/[Email] a/[Address] (OPTIONAL r/[Remark] t/Tags)`
  
##### Example usage:
* `add n/John p/89789678 e/John@gmail.com a/Singapore t/friend`
  ![AddNewDevToListExample](images/UG_images/AddNewDevToListExample.png)

  
### Remove developer

#### What this command does:
* Performs deletion of existing developers from the storage. Specify the index number as shown on the list.
#### Command format:
* `Delete [index number]`

#### Example usage:
- For example, to delete John from the list. First find the index number of John.
  ![DeletePersonFromListExample](images/UG_images/DeletePersonFromListExample.png)
- In this example, the index of John is 7. So type, `delete 7`.
  ![DeletedPersonFromListExample](images/UG_images/DeletedPersonFromListExample.png)

### Edit developer
#### What this command does:
* To edit personal information:
  - Command: `edit INDEX(must be a positive integer) [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [r/REMARK] [t/TAG]...`
  - Example: `edit 1 n/John Wick e/new.email@example.com`
  - Result: The person of index `1` now has a new name `John Wick` and a new
  email address `new.email@example.com`.
  - Note: You **do not need to provide** the arguments that you do not want to edit. In the
  given example above, I only want to edit this person's name and email address and nothing else,
  so I only provided this person's index `1`, new name `n/John Wick` 
  and new email address `e/new.email@example.com`.


### Find developer
#### What this command does:
* Finds persons whose names contain any of the given keywords.

##### Format: `find [KEYWORD]`
 - The search is case-insensitive. e.g hans will match Hans
 - The order of the keywords does not matter. e.g. Hans Bo will match Bo Hans
 - Only the name is searched.
 - Only full words will be matched e.g. Han will not match Hans
 - Persons matching at least one keyword will be returned (i.e. OR search). e.g. Hans Bo will return Hans Gruber, Bo Yang

##### Note:
The find command is designed to show only a list of developers. If you wish to view the team list again, you should use the `listt` command. To display the complete list of developers, use the `list` command. If you need to list both at the same time, you can use the `list` command twice or the `listt` command twice to revert to the default state.
   
##### Examples:

 - find John returns john and John Doe
 - find alex david returns Alex Yeoh, David Li
   ![Find](images/UG_images/Find.png)
### List developers
#### What this command does:
* Show only the list of all developers in the project.
* Note: Any additional words provided after the command will be ignored.
  (e.g. entering `list help delete 1 HAHAHA-1234` is equivalent to entering `list`)

#### Command format:
* `list`
#### Example usage:
* `list` (and an example result is shown below)
  ![ListCommandExample](images/UG_images/ListCommandExample.png)

### To return to the home page
* Use the same command `list`
* You will return to the home page.

**Example usage**: When you are at the main window, type `list` to show the developer list
and type `list` again when you want to go back to the main window.


## Managing Teams

### Create teams
#### What this command does:
* Creates a new team based on the given team name and leader name.

#### Command format:
* `newteam tn/[TeamName] tl/[TeamLeader]`
#### Example usage:
* `newteam tn/Team Delta tl/David Li`
  ![AddTeamCommandExample](images/UG_images/AddTeamCommandExample.png)

### Add developers to team
#### What this command does:
* To add a developer into an existing team:
#### Command format:
* `dev2team tn/[TeamName] n/[Developer Name]`
#### Example usage:
* `dev2team tn/Team Delta n/Irfan Ibrahim`
  ![AddDeveloperToTeamExample](images/UG_images/AddDevToTeamCommandExample.png)

### Delete team
#### What this command does:
* Performs deletion of existing teams from the storage.
#### Command format:
* `Delete id [name]`
#### Example usage:
* Example: `Delete 2 [name]`

### Remove developer from team

### Edit team name
* To edit team name:
  - Command: `editTeamName [tn/TEAMNAME(original team name)] [tn/TEAMNAME(new team name)]`
  - Example: `editTeamName tn/Alpha Team tn/Beta Team`
  - Result: Now, the team with original team name `Alpha Team` changed its team name
    to `Beta Team`.

### Edit team leader
* To edit team leader:
  - Command: `editTeamLeader [tn/TEAMNAME] [tl/TEAMLEADER]`
  - Example: `editTeamLeader tn/Alpha Team tl/Bob`
  - Result: Now, the team with team name `Alpha Team` changed its team leader to be `Bob`.

## Find Team
### What this command does:
- Finds teams whose names contain any of the given keywords.

##### Format: `findteam KEYWORD`
- The search is case-insensitive. e.g., "team" will match "Team Alpha."
- The order of the keywords does not matter. e.g., "Alpha Bravo" will match "Bravo Alpha Team."
- Only the team name is searched.
- Only full words will be matched. e.g., "Alph" will not match "Alpha Team."
- Teams matching at least one keyword will be returned (i.e., OR search). e.g., "Alpha Bravo" will return "Team Alpha," "Bravo Team."

##### Note:
The find command is designed to show only a list of teams. If you wish to view the developer list again, you should use the `list` command. To display the complete list of teams, use the `listt` command. If you need to list both at the same time, you can use the `list` command twice or the `listt` command twice to revert to the default state.

##### Examples:
- `findteam Alpha` returns "Team Alpha" and "Alpha Squad."
- `findteam Bravo Charlie` returns "Bravo Team," "Charlie Crew," and "Delta Bravo Charlie Team."

![Find Team](images/UG_images/Findteam.png)


### List teams
#### What this command does:
* Show only the list of all existing teams in the project.
* Note: Any additional words provided after the command will be ignored.
  (e.g. entering `listt help delete 1 HAHAHA-1234` is equivalent to entering `listt`)

#### Command format:
* `listt`
#### Example usage:
* `listt` (and an example result is shown below)
  ![ListTeamCommandExample](images/UG_images/ListTeamCommandExample.png)

  
### To return to the home page
* Use the same command `listt`
* You will return to the home page.


**Example usage**: When you are at the main window, type `listt` to show the team list
and type `listt` again when you want to go back to the main window.



### Display tree
#### What this command does:
* Provides a tree visualisation of all the teams and members in the project.
* Note: 
  - Any additional words provided after the command will be ignored.
  (e.g. entering `tree list delete 1 HAHAHA-1234` is equivalent to entering `tree`)
  - The project name **cannot be edited** because our application is designed to hold
the contact information of all the developers in **one** software engineering project,
the naming of this project is not important since there is only one project, and
we do not need names to differentiate between different projects.
  - The content in the tree **will not be updated in real time** because that requires
too much computer resources. Instead, the tree is **updated every time you show it**.
So, when you have some changes to the data, you should **hide the tree first if it is
shown**, and call command `tree` again to show the tree. Then your changes will be 
reflected in the new tree. With that being said, if you enter command `tree` to
show LinkTree and make some changes to the data, your changes will not be reflected
in the current tree. You should hide the tree first and then call `tree` again to
obtain a new tree which will reflect the changes you made.

### Command format: 
* `tree`
#### Example usage: 
* `tree` (and an example result is shown below)
![TreeResultExample](images/UG_images/TreeResultExample.png)

  

### To hide the tree
  * Use the same command `tree`
  * You will return to the home page.


**Example usage**: When you are at the main window, type `tree` to show the tree graph
and type `tree` again when you want to hide the tree and go back to the main window.


### Help
#### What this command does:
* Opens up a window which shows the link to this User Guide, which also comes with a button allowing copying the link;
* Display a summary of all commands of LinkTree, specifying the parameters needed.
* Note: Any additional words provided after the command will be ignored.
  (e.g. entering `help list delete 1 HAHAHA-1234` is equivalent to entering `help`)

#### Command format:
* `help`
* Or simply press F1

#### Example usage:
* `help` (and an example result is shown below)
  ![HelpWindow](images/UG_images/HelpWindow.png)
  ![HelpCommandResult](images/UG_images/HelpCommandResult.png)


### Reset the project

### Exit the application

--------------------------------------------------------------------------------------------------------------------

## Troubleshooting
- Details coming soon...

Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## FAQs
- Details coming soon...

Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## Support
- Details coming soon...

Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running it again.

Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## Command summary
- Details coming soon...

Click [here](#table-of-contents) to go back to contents.

--------------------------------------------------------------------------------------------------------------------

## Future Enhancement
- Currently, the find and finteam functions output "1 persons" and "1 teams" respectively, regardless of the number. The objective is to modify these functions to correctly handle singular and plural nouns. When the count is 1, the function should output "1 person" or "1 team," and for counts greater than 1, the function should output "N persons" or "N teams" appropriately.

Click [here](#table-of-contents) to go back to contents.

